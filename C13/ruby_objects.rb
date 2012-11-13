class Objects
	@var="Blalala"
	
	def var=(v)
		@var = v
	end
end
	def method
		puts "something in method"
	end


	def method
		puts "something in method"
	end

private

	def method_private
	 puts "Private!"

	end

	def method_private2

	end

	public

	def method_public

	end
end

attr_acessor :var
o = Objects.new
p o.var
o.var = 10
p o.var